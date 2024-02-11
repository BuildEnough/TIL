package me.buildenough.service;

import lombok.RequiredArgsConstructor;
import me.buildenough.domain.Article;
import me.buildenough.dto.AddArticleRequest;
import me.buildenough.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final, @NotNull 생성자
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
