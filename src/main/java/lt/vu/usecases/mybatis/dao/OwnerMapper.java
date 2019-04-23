package lt.vu.usecases.mybatis.dao;

import java.util.List;
import lt.vu.usecases.mybatis.model.Owner;

public interface OwnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int insert(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    Owner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    List<Owner> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Tue Apr 23 22:26:11 EEST 2019
     */
    int updateByPrimaryKey(Owner record);
}