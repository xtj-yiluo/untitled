package com.sogaa.system.service.businessfunctionrelation.bean;

import java.math.BigDecimal;
import java.util.Date;

public class QuotationBase {
    private String id;

    private String inquirer;

    private String inquirerName;

    private String inquirerCompany;

    private String inquirerTime;

    private String machiningType;

    private String hasMaterial;

    private String userDrawingLocation;

    private String userListLocation;

    private String priority;

    private String deliveryTime;

    private String expressPayType;

    private Double expressFee;

    private String needDesign;

    private Double designFee;

    private Double profit;

    private String taxRate;

    private Double tax;

    private Double discount;

    private Double discountRate;

    private Double total;

    private Double finalPrice;

    private Double finalPriceDiscount;

    private String remark;

    private String showTax;

    private String quoter;

    private String proStatus;

    private Integer requote;

    private String overTime;

    private String hasOrderIntention;

    private String hasOrder;

    private String quotePdf;

    private String quoteXls;

    private Double costPrice;

    private Double grossProfit;

    private Double grossProfitRate;

    private String lastDrawingLocation;

    private String lastListLocation;

    private String loseRemark;

    private Date loseTime;

    private String loseReason;

    private String losePerson;

    private String isUrgent;

    private String urgentFee;

    private String round;

    private String innerQuoteStatus;

    private BigDecimal taxRatePoint;

    private String isRemark;

    private String orderSize;

    private String followUp;

    private String isRegular;

    private String expectDeliveryDays;

    private Double expectTotalPrice;

    private String whetherContainsFreight;

    private String everMachined;

    private String quotationFromSupplier;

    private String sendCity;

    private String noFreightReason;

    private BigDecimal toningFee;

    private BigDecimal minSpreadPrice;

    private Date expectQuoteTime;

    private String drawingStandard;

    private String deliveryDate;

    private BigDecimal wireServiceFee;

    private String relatedAddressId;

    private BigDecimal materialCertFee;

    private BigDecimal dimInspectionFee;

    private BigDecimal cmmInspectionFee;

    private String inquirerTimeZone;

    private String shippingTermType;

    private String paymentConditionType;

    private String customerStatus;

    private String loadTimeStandard;

    private String shippingStandard;

    private String shippingCycle;

    private String shippingTerm;

    private BigDecimal customDuty;

    private Date createTime;

    private Date gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInquirer() {
        return inquirer;
    }

    public void setInquirer(String inquirer) {
        this.inquirer = inquirer == null ? null : inquirer.trim();
    }

    public String getInquirerName() {
        return inquirerName;
    }

    public void setInquirerName(String inquirerName) {
        this.inquirerName = inquirerName == null ? null : inquirerName.trim();
    }

    public String getInquirerCompany() {
        return inquirerCompany;
    }

    public void setInquirerCompany(String inquirerCompany) {
        this.inquirerCompany = inquirerCompany == null ? null : inquirerCompany.trim();
    }

    public String getInquirerTime() {
        return inquirerTime;
    }

    public void setInquirerTime(String inquirerTime) {
        this.inquirerTime = inquirerTime == null ? null : inquirerTime.trim();
    }

    public String getMachiningType() {
        return machiningType;
    }

    public void setMachiningType(String machiningType) {
        this.machiningType = machiningType == null ? null : machiningType.trim();
    }

    public String getHasMaterial() {
        return hasMaterial;
    }

    public void setHasMaterial(String hasMaterial) {
        this.hasMaterial = hasMaterial == null ? null : hasMaterial.trim();
    }

    public String getUserDrawingLocation() {
        return userDrawingLocation;
    }

    public void setUserDrawingLocation(String userDrawingLocation) {
        this.userDrawingLocation = userDrawingLocation == null ? null : userDrawingLocation.trim();
    }

    public String getUserListLocation() {
        return userListLocation;
    }

    public void setUserListLocation(String userListLocation) {
        this.userListLocation = userListLocation == null ? null : userListLocation.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime == null ? null : deliveryTime.trim();
    }

    public String getExpressPayType() {
        return expressPayType;
    }

    public void setExpressPayType(String expressPayType) {
        this.expressPayType = expressPayType == null ? null : expressPayType.trim();
    }

    public Double getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Double expressFee) {
        this.expressFee = expressFee;
    }

    public String getNeedDesign() {
        return needDesign;
    }

    public void setNeedDesign(String needDesign) {
        this.needDesign = needDesign == null ? null : needDesign.trim();
    }

    public Double getDesignFee() {
        return designFee;
    }

    public void setDesignFee(Double designFee) {
        this.designFee = designFee;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Double getFinalPriceDiscount() {
        return finalPriceDiscount;
    }

    public void setFinalPriceDiscount(Double finalPriceDiscount) {
        this.finalPriceDiscount = finalPriceDiscount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getShowTax() {
        return showTax;
    }

    public void setShowTax(String showTax) {
        this.showTax = showTax == null ? null : showTax.trim();
    }

    public String getQuoter() {
        return quoter;
    }

    public void setQuoter(String quoter) {
        this.quoter = quoter == null ? null : quoter.trim();
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus == null ? null : proStatus.trim();
    }

    public Integer getRequote() {
        return requote;
    }

    public void setRequote(Integer requote) {
        this.requote = requote;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime == null ? null : overTime.trim();
    }

    public String getHasOrderIntention() {
        return hasOrderIntention;
    }

    public void setHasOrderIntention(String hasOrderIntention) {
        this.hasOrderIntention = hasOrderIntention == null ? null : hasOrderIntention.trim();
    }

    public String getHasOrder() {
        return hasOrder;
    }

    public void setHasOrder(String hasOrder) {
        this.hasOrder = hasOrder == null ? null : hasOrder.trim();
    }

    public String getQuotePdf() {
        return quotePdf;
    }

    public void setQuotePdf(String quotePdf) {
        this.quotePdf = quotePdf == null ? null : quotePdf.trim();
    }

    public String getQuoteXls() {
        return quoteXls;
    }

    public void setQuoteXls(String quoteXls) {
        this.quoteXls = quoteXls == null ? null : quoteXls.trim();
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Double grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Double getGrossProfitRate() {
        return grossProfitRate;
    }

    public void setGrossProfitRate(Double grossProfitRate) {
        this.grossProfitRate = grossProfitRate;
    }

    public String getLastDrawingLocation() {
        return lastDrawingLocation;
    }

    public void setLastDrawingLocation(String lastDrawingLocation) {
        this.lastDrawingLocation = lastDrawingLocation == null ? null : lastDrawingLocation.trim();
    }

    public String getLastListLocation() {
        return lastListLocation;
    }

    public void setLastListLocation(String lastListLocation) {
        this.lastListLocation = lastListLocation == null ? null : lastListLocation.trim();
    }

    public String getLoseRemark() {
        return loseRemark;
    }

    public void setLoseRemark(String loseRemark) {
        this.loseRemark = loseRemark == null ? null : loseRemark.trim();
    }

    public Date getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(Date loseTime) {
        this.loseTime = loseTime;
    }

    public String getLoseReason() {
        return loseReason;
    }

    public void setLoseReason(String loseReason) {
        this.loseReason = loseReason == null ? null : loseReason.trim();
    }

    public String getLosePerson() {
        return losePerson;
    }

    public void setLosePerson(String losePerson) {
        this.losePerson = losePerson == null ? null : losePerson.trim();
    }

    public String getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(String isUrgent) {
        this.isUrgent = isUrgent == null ? null : isUrgent.trim();
    }

    public String getUrgentFee() {
        return urgentFee;
    }

    public void setUrgentFee(String urgentFee) {
        this.urgentFee = urgentFee == null ? null : urgentFee.trim();
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round == null ? null : round.trim();
    }

    public String getInnerQuoteStatus() {
        return innerQuoteStatus;
    }

    public void setInnerQuoteStatus(String innerQuoteStatus) {
        this.innerQuoteStatus = innerQuoteStatus == null ? null : innerQuoteStatus.trim();
    }

    public BigDecimal getTaxRatePoint() {
        return taxRatePoint;
    }

    public void setTaxRatePoint(BigDecimal taxRatePoint) {
        this.taxRatePoint = taxRatePoint;
    }

    public String getIsRemark() {
        return isRemark;
    }

    public void setIsRemark(String isRemark) {
        this.isRemark = isRemark == null ? null : isRemark.trim();
    }

    public String getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize == null ? null : orderSize.trim();
    }

    public String getFollowUp() {
        return followUp;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp == null ? null : followUp.trim();
    }

    public String getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(String isRegular) {
        this.isRegular = isRegular == null ? null : isRegular.trim();
    }

    public String getExpectDeliveryDays() {
        return expectDeliveryDays;
    }

    public void setExpectDeliveryDays(String expectDeliveryDays) {
        this.expectDeliveryDays = expectDeliveryDays == null ? null : expectDeliveryDays.trim();
    }

    public Double getExpectTotalPrice() {
        return expectTotalPrice;
    }

    public void setExpectTotalPrice(Double expectTotalPrice) {
        this.expectTotalPrice = expectTotalPrice;
    }

    public String getWhetherContainsFreight() {
        return whetherContainsFreight;
    }

    public void setWhetherContainsFreight(String whetherContainsFreight) {
        this.whetherContainsFreight = whetherContainsFreight == null ? null : whetherContainsFreight.trim();
    }

    public String getEverMachined() {
        return everMachined;
    }

    public void setEverMachined(String everMachined) {
        this.everMachined = everMachined == null ? null : everMachined.trim();
    }

    public String getQuotationFromSupplier() {
        return quotationFromSupplier;
    }

    public void setQuotationFromSupplier(String quotationFromSupplier) {
        this.quotationFromSupplier = quotationFromSupplier == null ? null : quotationFromSupplier.trim();
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity == null ? null : sendCity.trim();
    }

    public String getNoFreightReason() {
        return noFreightReason;
    }

    public void setNoFreightReason(String noFreightReason) {
        this.noFreightReason = noFreightReason == null ? null : noFreightReason.trim();
    }

    public BigDecimal getToningFee() {
        return toningFee;
    }

    public void setToningFee(BigDecimal toningFee) {
        this.toningFee = toningFee;
    }

    public BigDecimal getMinSpreadPrice() {
        return minSpreadPrice;
    }

    public void setMinSpreadPrice(BigDecimal minSpreadPrice) {
        this.minSpreadPrice = minSpreadPrice;
    }

    public Date getExpectQuoteTime() {
        return expectQuoteTime;
    }

    public void setExpectQuoteTime(Date expectQuoteTime) {
        this.expectQuoteTime = expectQuoteTime;
    }

    public String getDrawingStandard() {
        return drawingStandard;
    }

    public void setDrawingStandard(String drawingStandard) {
        this.drawingStandard = drawingStandard == null ? null : drawingStandard.trim();
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate == null ? null : deliveryDate.trim();
    }

    public BigDecimal getWireServiceFee() {
        return wireServiceFee;
    }

    public void setWireServiceFee(BigDecimal wireServiceFee) {
        this.wireServiceFee = wireServiceFee;
    }

    public String getRelatedAddressId() {
        return relatedAddressId;
    }

    public void setRelatedAddressId(String relatedAddressId) {
        this.relatedAddressId = relatedAddressId == null ? null : relatedAddressId.trim();
    }

    public BigDecimal getMaterialCertFee() {
        return materialCertFee;
    }

    public void setMaterialCertFee(BigDecimal materialCertFee) {
        this.materialCertFee = materialCertFee;
    }

    public BigDecimal getDimInspectionFee() {
        return dimInspectionFee;
    }

    public void setDimInspectionFee(BigDecimal dimInspectionFee) {
        this.dimInspectionFee = dimInspectionFee;
    }

    public BigDecimal getCmmInspectionFee() {
        return cmmInspectionFee;
    }

    public void setCmmInspectionFee(BigDecimal cmmInspectionFee) {
        this.cmmInspectionFee = cmmInspectionFee;
    }

    public String getInquirerTimeZone() {
        return inquirerTimeZone;
    }

    public void setInquirerTimeZone(String inquirerTimeZone) {
        this.inquirerTimeZone = inquirerTimeZone == null ? null : inquirerTimeZone.trim();
    }

    public String getShippingTermType() {
        return shippingTermType;
    }

    public void setShippingTermType(String shippingTermType) {
        this.shippingTermType = shippingTermType == null ? null : shippingTermType.trim();
    }

    public String getPaymentConditionType() {
        return paymentConditionType;
    }

    public void setPaymentConditionType(String paymentConditionType) {
        this.paymentConditionType = paymentConditionType == null ? null : paymentConditionType.trim();
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus == null ? null : customerStatus.trim();
    }

    public String getLoadTimeStandard() {
        return loadTimeStandard;
    }

    public void setLoadTimeStandard(String loadTimeStandard) {
        this.loadTimeStandard = loadTimeStandard == null ? null : loadTimeStandard.trim();
    }

    public String getShippingStandard() {
        return shippingStandard;
    }

    public void setShippingStandard(String shippingStandard) {
        this.shippingStandard = shippingStandard == null ? null : shippingStandard.trim();
    }

    public String getShippingCycle() {
        return shippingCycle;
    }

    public void setShippingCycle(String shippingCycle) {
        this.shippingCycle = shippingCycle == null ? null : shippingCycle.trim();
    }

    public String getShippingTerm() {
        return shippingTerm;
    }

    public void setShippingTerm(String shippingTerm) {
        this.shippingTerm = shippingTerm == null ? null : shippingTerm.trim();
    }

    public BigDecimal getCustomDuty() {
        return customDuty;
    }

    public void setCustomDuty(BigDecimal customDuty) {
        this.customDuty = customDuty;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}