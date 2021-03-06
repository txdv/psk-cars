package lt.vu.usecases.mybatis.model;

import lombok.Setter;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Insurance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.INSURANCE.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.INSURANCE.DATE_START
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private Date dateStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.INSURANCE.DATE_END
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private Date dateEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.INSURANCE.PRICE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.INSURANCE.ID
     *
     * @return the value of PUBLIC.INSURANCE.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.INSURANCE.ID
     *
     * @param id the value for PUBLIC.INSURANCE.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.INSURANCE.DATE_START
     *
     * @return the value of PUBLIC.INSURANCE.DATE_START
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.INSURANCE.DATE_START
     *
     * @param dateStart the value for PUBLIC.INSURANCE.DATE_START
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.INSURANCE.DATE_END
     *
     * @return the value of PUBLIC.INSURANCE.DATE_END
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.INSURANCE.DATE_END
     *
     * @param dateEnd the value for PUBLIC.INSURANCE.DATE_END
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.INSURANCE.PRICE
     *
     * @return the value of PUBLIC.INSURANCE.PRICE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.INSURANCE.PRICE
     *
     * @param price the value for PUBLIC.INSURANCE.PRICE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Setter
    @Getter
    private List<Car> cars;
}