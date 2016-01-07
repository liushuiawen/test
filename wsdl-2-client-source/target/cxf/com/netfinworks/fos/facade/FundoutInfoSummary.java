
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fundoutInfoSummary complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fundoutInfoSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalFeeAmount" type="{http://facade.fos.netfinworks.com}money" minOccurs="0"/>
 *         &lt;element name="totalFeeCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalFundoutAmount" type="{http://facade.fos.netfinworks.com}money" minOccurs="0"/>
 *         &lt;element name="totalFundoutCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundoutInfoSummary", propOrder = {
    "totalFeeAmount",
    "totalFeeCount",
    "totalFundoutAmount",
    "totalFundoutCount"
})
public class FundoutInfoSummary {

    protected Money totalFeeAmount;
    protected long totalFeeCount;
    protected Money totalFundoutAmount;
    protected long totalFundoutCount;

    /**
     * 获取totalFeeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalFeeAmount() {
        return totalFeeAmount;
    }

    /**
     * 设置totalFeeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalFeeAmount(Money value) {
        this.totalFeeAmount = value;
    }

    /**
     * 获取totalFeeCount属性的值。
     * 
     */
    public long getTotalFeeCount() {
        return totalFeeCount;
    }

    /**
     * 设置totalFeeCount属性的值。
     * 
     */
    public void setTotalFeeCount(long value) {
        this.totalFeeCount = value;
    }

    /**
     * 获取totalFundoutAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalFundoutAmount() {
        return totalFundoutAmount;
    }

    /**
     * 设置totalFundoutAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalFundoutAmount(Money value) {
        this.totalFundoutAmount = value;
    }

    /**
     * 获取totalFundoutCount属性的值。
     * 
     */
    public long getTotalFundoutCount() {
        return totalFundoutCount;
    }

    /**
     * 设置totalFundoutCount属性的值。
     * 
     */
    public void setTotalFundoutCount(long value) {
        this.totalFundoutCount = value;
    }

}
