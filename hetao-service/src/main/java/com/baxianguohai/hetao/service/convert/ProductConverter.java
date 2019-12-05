package com.baxianguohai.hetao.service.convert;



import com.baxianguohai.hetao.biz.dal.model.ProductDO;
import com.baxianguohai.hetao.entity.bo.ProductBO;

import java.util.Objects;

/**
 * 商品表实体类转换器
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public class ProductConverter {

    /**
     * Convert ProductDO to ProductBO
     *
     * @param productDO
     * @return productBO
     */
    public static ProductBO convertToDO2BO(ProductDO productDO) {
        if (Objects.isNull(productDO)) {
            return null;
        }
        ProductBO productBO = new ProductBO();
        productBO.setId(productDO.getId());
        productBO.setProductName(productDO.getProductName());
        productBO.setProductNumber(productDO.getProductNumber());
        productBO.setPrice(productDO.getPrice());
        productBO.setProductDescription(productDO.getProductDescription());
        productBO.setProductSlideshow(productDO.getProductSlideshow());
        productBO.setProductSmallIcon(productDO.getProductSmallIcon());
        productBO.setProductIntroduce(productDO.getProductIntroduce());
        productBO.setIsDelete(productDO.getIsDelete());
        productBO.setGmtCreated(productDO.getGmtCreated());
        productBO.setGmtModified(productDO.getGmtModified());
        return productBO;
    }

    /**
     * Convert ProductBO to ProductDO
     *
     * @param productBO
     * @return productDO
     */
    public static ProductDO convertToBO2DO(ProductBO productBO) {
        if (Objects.isNull(productBO)) {
            return null;
        }
        ProductDO productDO = new ProductDO();
        productDO.setId(productBO.getId());
        productDO.setProductName(productBO.getProductName());
        productDO.setProductNumber(productBO.getProductNumber());
        productDO.setPrice(productBO.getPrice());
        productDO.setProductDescription(productBO.getProductDescription());
        productDO.setProductSlideshow(productBO.getProductSlideshow());
        productDO.setProductSmallIcon(productBO.getProductSmallIcon());
        productDO.setProductIntroduce(productBO.getProductIntroduce());
        productDO.setIsDelete(productBO.getIsDelete());
        productDO.setGmtCreated(productBO.getGmtCreated());
        productDO.setGmtModified(productBO.getGmtModified());
        return productDO;
    }
}