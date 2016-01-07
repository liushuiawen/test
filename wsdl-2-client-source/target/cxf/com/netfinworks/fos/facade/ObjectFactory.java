
package com.netfinworks.fos.facade;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netfinworks.fos.facade package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SimplePay_QNAME = new QName("http://facade.fos.netfinworks.com", "simplePay");
    private final static QName _QueryFundoutOrderInfo_QNAME = new QName("http://facade.fos.netfinworks.com", "queryFundoutOrderInfo");
    private final static QName _SimplePayResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "simplePayResponse");
    private final static QName _QueryFundoutOrderInfoResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "queryFundoutOrderInfoResponse");
    private final static QName _QueryFundoutInfo_QNAME = new QName("http://facade.fos.netfinworks.com", "queryFundoutInfo");
    private final static QName _Submit_QNAME = new QName("http://facade.fos.netfinworks.com", "submit");
    private final static QName _SubmitResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "submitResponse");
    private final static QName _QuerySummary_QNAME = new QName("http://facade.fos.netfinworks.com", "querySummary");
    private final static QName _GetFundoutInfo_QNAME = new QName("http://facade.fos.netfinworks.com", "getFundoutInfo");
    private final static QName _GetFundoutInfoResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "getFundoutInfoResponse");
    private final static QName _QuerySummaryResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "querySummaryResponse");
    private final static QName _QueryFundoutInfoResponse_QNAME = new QName("http://facade.fos.netfinworks.com", "queryFundoutInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netfinworks.fos.facade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimplePay }
     * 
     */
    public SimplePay createSimplePay() {
        return new SimplePay();
    }

    /**
     * Create an instance of {@link Submit }
     * 
     */
    public Submit createSubmit() {
        return new Submit();
    }

    /**
     * Create an instance of {@link QueryFundoutInfo }
     * 
     */
    public QueryFundoutInfo createQueryFundoutInfo() {
        return new QueryFundoutInfo();
    }

    /**
     * Create an instance of {@link QueryFundoutOrderInfoResponse }
     * 
     */
    public QueryFundoutOrderInfoResponse createQueryFundoutOrderInfoResponse() {
        return new QueryFundoutOrderInfoResponse();
    }

    /**
     * Create an instance of {@link SimplePayResponse }
     * 
     */
    public SimplePayResponse createSimplePayResponse() {
        return new SimplePayResponse();
    }

    /**
     * Create an instance of {@link QueryFundoutOrderInfo }
     * 
     */
    public QueryFundoutOrderInfo createQueryFundoutOrderInfo() {
        return new QueryFundoutOrderInfo();
    }

    /**
     * Create an instance of {@link GetFundoutInfoResponse }
     * 
     */
    public GetFundoutInfoResponse createGetFundoutInfoResponse() {
        return new GetFundoutInfoResponse();
    }

    /**
     * Create an instance of {@link GetFundoutInfo }
     * 
     */
    public GetFundoutInfo createGetFundoutInfo() {
        return new GetFundoutInfo();
    }

    /**
     * Create an instance of {@link QuerySummary }
     * 
     */
    public QuerySummary createQuerySummary() {
        return new QuerySummary();
    }

    /**
     * Create an instance of {@link SubmitResponse }
     * 
     */
    public SubmitResponse createSubmitResponse() {
        return new SubmitResponse();
    }

    /**
     * Create an instance of {@link QueryFundoutInfoResponse }
     * 
     */
    public QueryFundoutInfoResponse createQueryFundoutInfoResponse() {
        return new QueryFundoutInfoResponse();
    }

    /**
     * Create an instance of {@link QuerySummaryResponse }
     * 
     */
    public QuerySummaryResponse createQuerySummaryResponse() {
        return new QuerySummaryResponse();
    }

    /**
     * Create an instance of {@link OperationEnvironment }
     * 
     */
    public OperationEnvironment createOperationEnvironment() {
        return new OperationEnvironment();
    }

    /**
     * Create an instance of {@link FundoutQueryRequest }
     * 
     */
    public FundoutQueryRequest createFundoutQueryRequest() {
        return new FundoutQueryRequest();
    }

    /**
     * Create an instance of {@link FundoutQueryResponse }
     * 
     */
    public FundoutQueryResponse createFundoutQueryResponse() {
        return new FundoutQueryResponse();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link PaginatedQueryResponse }
     * 
     */
    public PaginatedQueryResponse createPaginatedQueryResponse() {
        return new PaginatedQueryResponse();
    }

    /**
     * Create an instance of {@link PaginatedQueryRequest }
     * 
     */
    public PaginatedQueryRequest createPaginatedQueryRequest() {
        return new PaginatedQueryRequest();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link FundoutInfoSummary }
     * 
     */
    public FundoutInfoSummary createFundoutInfoSummary() {
        return new FundoutInfoSummary();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link FundoutGetResponse }
     * 
     */
    public FundoutGetResponse createFundoutGetResponse() {
        return new FundoutGetResponse();
    }

    /**
     * Create an instance of {@link QueryBase }
     * 
     */
    public QueryBase createQueryBase() {
        return new QueryBase();
    }

    /**
     * Create an instance of {@link FundoutRequest }
     * 
     */
    public FundoutRequest createFundoutRequest() {
        return new FundoutRequest();
    }

    /**
     * Create an instance of {@link FundoutInfo }
     * 
     */
    public FundoutInfo createFundoutInfo() {
        return new FundoutInfo();
    }

    /**
     * Create an instance of {@link BaseInfo }
     * 
     */
    public BaseInfo createBaseInfo() {
        return new BaseInfo();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link FundoutSummaryQueryResponse }
     * 
     */
    public FundoutSummaryQueryResponse createFundoutSummaryQueryResponse() {
        return new FundoutSummaryQueryResponse();
    }

    /**
     * Create an instance of {@link FundoutResponse }
     * 
     */
    public FundoutResponse createFundoutResponse() {
        return new FundoutResponse();
    }

    /**
     * Create an instance of {@link Kvp }
     * 
     */
    public Kvp createKvp() {
        return new Kvp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "simplePay")
    public JAXBElement<SimplePay> createSimplePay(SimplePay value) {
        return new JAXBElement<SimplePay>(_SimplePay_QNAME, SimplePay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryFundoutOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "queryFundoutOrderInfo")
    public JAXBElement<QueryFundoutOrderInfo> createQueryFundoutOrderInfo(QueryFundoutOrderInfo value) {
        return new JAXBElement<QueryFundoutOrderInfo>(_QueryFundoutOrderInfo_QNAME, QueryFundoutOrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "simplePayResponse")
    public JAXBElement<SimplePayResponse> createSimplePayResponse(SimplePayResponse value) {
        return new JAXBElement<SimplePayResponse>(_SimplePayResponse_QNAME, SimplePayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryFundoutOrderInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "queryFundoutOrderInfoResponse")
    public JAXBElement<QueryFundoutOrderInfoResponse> createQueryFundoutOrderInfoResponse(QueryFundoutOrderInfoResponse value) {
        return new JAXBElement<QueryFundoutOrderInfoResponse>(_QueryFundoutOrderInfoResponse_QNAME, QueryFundoutOrderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryFundoutInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "queryFundoutInfo")
    public JAXBElement<QueryFundoutInfo> createQueryFundoutInfo(QueryFundoutInfo value) {
        return new JAXBElement<QueryFundoutInfo>(_QueryFundoutInfo_QNAME, QueryFundoutInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Submit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "submit")
    public JAXBElement<Submit> createSubmit(Submit value) {
        return new JAXBElement<Submit>(_Submit_QNAME, Submit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "submitResponse")
    public JAXBElement<SubmitResponse> createSubmitResponse(SubmitResponse value) {
        return new JAXBElement<SubmitResponse>(_SubmitResponse_QNAME, SubmitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "querySummary")
    public JAXBElement<QuerySummary> createQuerySummary(QuerySummary value) {
        return new JAXBElement<QuerySummary>(_QuerySummary_QNAME, QuerySummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFundoutInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "getFundoutInfo")
    public JAXBElement<GetFundoutInfo> createGetFundoutInfo(GetFundoutInfo value) {
        return new JAXBElement<GetFundoutInfo>(_GetFundoutInfo_QNAME, GetFundoutInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFundoutInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "getFundoutInfoResponse")
    public JAXBElement<GetFundoutInfoResponse> createGetFundoutInfoResponse(GetFundoutInfoResponse value) {
        return new JAXBElement<GetFundoutInfoResponse>(_GetFundoutInfoResponse_QNAME, GetFundoutInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "querySummaryResponse")
    public JAXBElement<QuerySummaryResponse> createQuerySummaryResponse(QuerySummaryResponse value) {
        return new JAXBElement<QuerySummaryResponse>(_QuerySummaryResponse_QNAME, QuerySummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryFundoutInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.fos.netfinworks.com", name = "queryFundoutInfoResponse")
    public JAXBElement<QueryFundoutInfoResponse> createQueryFundoutInfoResponse(QueryFundoutInfoResponse value) {
        return new JAXBElement<QueryFundoutInfoResponse>(_QueryFundoutInfoResponse_QNAME, QueryFundoutInfoResponse.class, null, value);
    }

}
