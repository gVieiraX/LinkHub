package com.tinylinkapi.repository;

import com.tinylinkapi.entity.TinyLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TinyLinkRepository  extends JpaRepository<TinyLink, Long> {
}
