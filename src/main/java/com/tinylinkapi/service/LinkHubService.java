package com.tinylinkapi.service;

import com.tinylinkapi.entity.LinkHub;
import com.tinylinkapi.repository.LinkHubRepository;
import com.tinylinkapi.response.LinkHubResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class LinkHubService {

    private  final LinkHubRepository linkHubRepository;

    @Autowired
    public LinkHubService(LinkHubRepository tinyLinkRepository) {
        this.linkHubRepository = tinyLinkRepository;
    }

    public LinkHubResponse create(LinkHub linkHub) {
            boolean existePortfolio = linkHubRepository.findByUrlPortfolio(linkHub.getUrlPortfolio()).isPresent();
            boolean existeEmail = linkHubRepository.findByEmail(linkHub.getEmail()).isPresent();

            String message = "Obrigado por se cadastrar!";
        LinkHub existeTiny = null;

            if (existePortfolio && existeEmail) {
                message = "O portfólio " + linkHub.getUrlPortfolio() + " e o email " + linkHub.getEmail() + " já foram cadastrados.";
                existeTiny = linkHubRepository.findByEmail(linkHub.getEmail()).get();
            } else if (existeEmail) {
                message = "O email " + linkHub.getEmail() + " já foi cadastrado.";
                existeTiny = linkHubRepository.findByEmail(linkHub.getEmail()).get();
            } else if (existePortfolio) {
                message = "O portfólio " + linkHub.getUrlPortfolio() + " já foi cadastrado.";
                existeTiny = linkHubRepository.findByUrlPortfolio(linkHub.getUrlPortfolio()).get();
            } else {
                existeTiny = linkHubRepository.save(linkHub);
            }

            return new LinkHubResponse(message, existeTiny);
        }


        public List<LinkHub> show(LinkHub linkHub){
        return this.linkHubRepository.findAll();
    }

    public Optional<LinkHub> showId(Long id) {
        return this.linkHubRepository.findById(id);
    }

    public List<LinkHub> update(LinkHub linkHub) {
        return Collections.singletonList(linkHubRepository.save(linkHub));

    }


    public String delete(Long id) {
        Optional<LinkHub> tinyLinkOptional = linkHubRepository.findById(id);
        if (tinyLinkOptional.isPresent()) {
            linkHubRepository.deleteById(id);
            return "Usuário com id: " + id + " foi deletado com sucesso";
        } else {
            return "Usuário com id: " + id + " não foi encontrado";
        }
    }

}
