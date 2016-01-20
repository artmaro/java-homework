package ru.hibernate.example;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.bytecode.internal.javassist.FieldHandled;
import org.hibernate.bytecode.internal.javassist.FieldHandler;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table(name = "stock", uniqueConstraints = {
        @UniqueConstraint(columnNames = "STOCK_NAME"),
        @UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock implements java.io.Serializable  {

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private StockDetail stockDetail;
    private int sum;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Stock(String stockCode, String stockName, StockDetail stockDetail) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.stockDetail = stockDetail;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }


    @Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    @NotNull
    @Size(min = 2, max = 10, message = "bla bla")
    @Column(name = "STOCK_NAME", unique = true, nullable = true, length = 20)
    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "stock", optional = false)
    @LazyToOne(LazyToOneOption.NO_PROXY)
    public StockDetail getStockDetail() {
        return this.stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    @Min(value = 10, message = "Your value must be more than 10")
    @Column(name = "STOCK_SUM")
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}