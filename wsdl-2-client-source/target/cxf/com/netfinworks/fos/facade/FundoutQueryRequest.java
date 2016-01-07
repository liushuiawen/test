
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>fundoutQueryRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fundoutQueryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://facade.fos.netfinworks.com}paginatedQueryRequest">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountFrom" type="{http://facade.fos.netfinworks.com}money" minOccurs="0"/>
 *         &lt;element name="amountTo" type="{http://facade.fos.netfinworks.com}money" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyOrPersonal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundoutOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasBatchOrderNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasNoBatchOrderNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasOutOrderNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="refundTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resultTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resultTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceBatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundoutQueryRequest", propOrder = {
    "accountNo",
    "amountFrom",
    "amountTo",
    "bankCode",
    "batchOrderNo",
    "cardNo",
    "companyOrPersonal",
    "extension",
    "fundoutOrderNo",
    "hasBatchOrderNo",
    "hasNoBatchOrderNo",
    "hasOutOrderNo",
    "memberId",
    "memo",
    "orderTimeEnd",
    "orderTimeStart",
    "outOrderNo",
    "paymentOrderNo",
    "productCode",
    "refundTimeEnd",
    "refundTimeStart",
    "resultTimeEnd",
    "resultTimeStart",
    "sourceBatchNo",
    "status"
})
public class FundoutQueryRequest
    extends PaginatedQueryRequest
{

    protected String accountNo;
    protected Money amountFrom;
    protected Money amountTo;
    protected String bankCode;
    protected String batchOrderNo;
    protected String cardNo;
    protected String companyOrPersonal;
    protected String extension;
    protected String fundoutOrderNo;
    protected boolean hasBatchOrderNo;
    protected boolean hasNoBatchOrderNo;
    protected boolean hasOutOrderNo;
    protected String memberId;
    protected String memo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderTimeEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderTimeStart;
    protected String outOrderNo;
    protected String paymentOrderNo;
    protected String productCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTimeEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTimeStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resultTimeEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resultTimeStart;
    protected String sourceBatchNo;
    protected String status;

    /**
     * 获取accountNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置accountNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * 获取amountFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountFrom() {
        return amountFrom;
    }

    /**
     * 设置amountFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountFrom(Money value) {
        this.amountFrom = value;
    }

    /**
     * 获取amountTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountTo() {
        return amountTo;
    }

    /**
     * 设置amountTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountTo(Money value) {
        this.amountTo = value;
    }

    /**
     * 获取bankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置bankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * 获取batchOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchOrderNo() {
        return batchOrderNo;
    }

    /**
     * 设置batchOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchOrderNo(String value) {
        this.batchOrderNo = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取companyOrPersonal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyOrPersonal() {
        return companyOrPersonal;
    }

    /**
     * 设置companyOrPersonal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyOrPersonal(String value) {
        this.companyOrPersonal = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * 获取fundoutOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundoutOrderNo() {
        return fundoutOrderNo;
    }

    /**
     * 设置fundoutOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundoutOrderNo(String value) {
        this.fundoutOrderNo = value;
    }

    /**
     * 获取hasBatchOrderNo属性的值。
     * 
     */
    public boolean isHasBatchOrderNo() {
        return hasBatchOrderNo;
    }

    /**
     * 设置hasBatchOrderNo属性的值。
     * 
     */
    public void setHasBatchOrderNo(boolean value) {
        this.hasBatchOrderNo = value;
    }

    /**
     * 获取hasNoBatchOrderNo属性的值。
     * 
     */
    public boolean isHasNoBatchOrderNo() {
        return hasNoBatchOrderNo;
    }

    /**
     * 设置hasNoBatchOrderNo属性的值。
     * 
     */
    public void setHasNoBatchOrderNo(boolean value) {
        this.hasNoBatchOrderNo = value;
    }

    /**
     * 获取hasOutOrderNo属性的值。
     * 
     */
    public boolean isHasOutOrderNo() {
        return hasOutOrderNo;
    }

    /**
     * 设置hasOutOrderNo属性的值。
     * 
     */
    public void setHasOutOrderNo(boolean value) {
        this.hasOutOrderNo = value;
    }

    /**
     * 获取memberId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置memberId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取orderTimeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTimeEnd() {
        return orderTimeEnd;
    }

    /**
     * 设置orderTimeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTimeEnd(XMLGregorianCalendar value) {
        this.orderTimeEnd = value;
    }

    /**
     * 获取orderTimeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTimeStart() {
        return orderTimeStart;
    }

    /**
     * 设置orderTimeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTimeStart(XMLGregorianCalendar value) {
        this.orderTimeStart = value;
    }

    /**
     * 获取outOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * 设置outOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderNo(String value) {
        this.outOrderNo = value;
    }

    /**
     * 获取paymentOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    /**
     * 设置paymentOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderNo(String value) {
        this.paymentOrderNo = value;
    }

    /**
     * 获取productCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置productCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * 获取refundTimeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundTimeEnd() {
        return refundTimeEnd;
    }

    /**
     * 设置refundTimeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundTimeEnd(XMLGregorianCalendar value) {
        this.refundTimeEnd = value;
    }

    /**
     * 获取refundTimeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundTimeStart() {
        return refundTimeStart;
    }

    /**
     * 设置refundTimeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundTimeStart(XMLGregorianCalendar value) {
        this.refundTimeStart = value;
    }

    /**
     * 获取resultTimeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResultTimeEnd() {
        return resultTimeEnd;
    }

    /**
     * 设置resultTimeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResultTimeEnd(XMLGregorianCalendar value) {
        this.resultTimeEnd = value;
    }

    /**
     * 获取resultTimeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResultTimeStart() {
        return resultTimeStart;
    }

    /**
     * 设置resultTimeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResultTimeStart(XMLGregorianCalendar value) {
        this.resultTimeStart = value;
    }

    /**
     * 获取sourceBatchNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBatchNo() {
        return sourceBatchNo;
    }

    /**
     * 设置sourceBatchNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBatchNo(String value) {
        this.sourceBatchNo = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
