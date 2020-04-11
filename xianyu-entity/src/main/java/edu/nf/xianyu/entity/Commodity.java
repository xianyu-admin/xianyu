package edu.nf.xianyu.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 * 商品详细实体
 */
@Data
@Document(indexName = "commodity")
public class Commodity {
    @Id
    private int commodityId;
    @Field(type = FieldType.Integer)
    private int categroyId;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commodityName;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private double commodityPrice;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commodityLable;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commoditySpec;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commodityDesc;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commoditySep;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commodityOrgin;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String commodityPci;
    @Field(type = FieldType.Integer)
    private int commodityStatus;
    @Field(type = FieldType.Date)
    private Timestamp createTime;
    @Field(type = FieldType.Date)
    private Timestamp updateTime;
}