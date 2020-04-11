package edu.nf.xianyu.config;

import edu.nf.xianyu.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author LWP
 * @date 2020/4/11
 */
public interface EsConfig  extends ElasticsearchRepository<Commodity,String> {
}