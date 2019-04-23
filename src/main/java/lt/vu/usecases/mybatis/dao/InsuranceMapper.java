package lt.vu.usecases.mybatis.dao;

import java.util.List;
import lt.vu.usecases.mybatis.model.Insurance;

public interface InsuranceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INSURANCE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INSURANCE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int insert(Insurance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INSURANCE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    Insurance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INSURANCE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    List<Insurance> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.INSURANCE
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int updateByPrimaryKey(Insurance record);
}