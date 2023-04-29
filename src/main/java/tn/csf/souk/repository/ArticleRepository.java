package tn.csf.souk.repository;
import org.springframework.data.repository.CrudRepository;

import tn.csf.souk.model.Article;
 
  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  