package edu.nf.xianyu.config;

import edu.nf.xianyu.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author LWP
 * @date 2020/3/31
 */
public interface EcConfig extends ElasticsearchRepository<Commodity,String> {
}