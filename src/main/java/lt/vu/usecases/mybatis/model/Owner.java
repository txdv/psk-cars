package lt.vu.usecases.mybatis.model;

public class Owner {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.OWNER.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.OWNER.FIRST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.OWNER.LAST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    private String lastName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.OWNER.ID
     *
     * @return the value of PUBLIC.OWNER.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.OWNER.ID
     *
     * @param id the value for PUBLIC.OWNER.ID
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.OWNER.FIRST_NAME
     *
     * @return the value of PUBLIC.OWNER.FIRST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.OWNER.FIRST_NAME
     *
     * @param firstName the value for PUBLIC.OWNER.FIRST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.OWNER.LAST_NAME
     *
     * @return the value of PUBLIC.OWNER.LAST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.OWNER.LAST_NAME
     *
     * @param lastName the value for PUBLIC.OWNER.LAST_NAME
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}