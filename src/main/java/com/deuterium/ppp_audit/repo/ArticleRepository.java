package com.deuterium.ppp_audit.repo;

import com.deuterium.ppp_audit.domain.Article;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
@JaversSpringDataAuditable
public interface ArticleRepository extends PagingAndSortingRepository<Article, UUID> {
}
