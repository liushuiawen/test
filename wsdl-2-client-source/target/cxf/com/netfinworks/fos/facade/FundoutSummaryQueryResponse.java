
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fundoutSummaryQueryResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fundoutSummaryQueryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://facade.fos.netfinworks.com}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="fundoutInfoSummary" type="{http://facade.fos.netfinworks.com}fundoutInfoSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundoutSummaryQueryResponse", propOrder = {
    "fundoutInfoSummary"
})
public class FundoutSummaryQueryResponse
    extends BaseResponse
{

    protected FundoutInfoSummary fundoutInfoSummary;

    /**
     * 获取fundoutInfoSummary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FundoutInfoSummary }
     *     
     */
    public FundoutInfoSummary getFundoutInfoSummary() {
        return fundoutInfoSummary;
    }

    /**
     * 设置fundoutInfoSummary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FundoutInfoSummary }
     *     
     */
    public void setFundoutInfoSummary(FundoutInfoSummary value) {
        this.fundoutInfoSummary = value;
    }

}
