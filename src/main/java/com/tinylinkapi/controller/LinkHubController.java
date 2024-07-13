package com.tinylinkapi.controller;

import com.tinylinkapi.entity.LinkHub;
import com.tinylinkapi.response.LinkHubResponse;
import com.tinylinkapi.service.LinkHubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("linkhub")
public class LinkHubController {

    LinkHubService linkHubService;

    public LinkHubController(LinkHubService linkHubService) {
        this.linkHubService = linkHubService;
    }

    @PostMapping
    public ResponseEntity<LinkHubResponse> create(@RequestBody LinkHub linkHub) {
        LinkHubResponse response = linkHubService.create(linkHub);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public List<LinkHub> show(LinkHub linkHub ){
        List<LinkHub> list = this.linkHubService.show(linkHub);
        return list;
    }

    @GetMapping("{id}")
    public Optional<LinkHub> showId(@PathVariable("id") Long id){
        Optional<LinkHub> listId = this.linkHubService.showId(id);
        return  listId;
    }


    @PutMapping
    public List<LinkHub> save(@RequestBody  LinkHub linkHub){
        return linkHubService.update(linkHub);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Long id){
       return linkHubService.delete(id);

    }

}
