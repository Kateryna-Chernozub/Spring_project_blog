package com.firstproject.blog.repo;

import com.firstproject.blog.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {
    //CrudRepository - вбудований інтерфейс в якому є фуннції CRUD, в <з яким елементом працюю, тип данних для id>. Тут нічого не пишу, бо все є в Репозиторії круд
}
