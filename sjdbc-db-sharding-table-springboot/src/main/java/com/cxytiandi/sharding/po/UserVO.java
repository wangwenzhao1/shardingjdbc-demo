package com.cxytiandi.sharding.po;

import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Description:
 * </p>
 *
 * @ClassName: UserVO
 * @author wangwenzhao
 * @date Jan 13, 20215:03:04 PM
 * @version: V1.0
 */
public class UserVO extends User {

    private Integer id;

    /**
     * @author wangwenzhao
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty("row_start_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Min(message = "最小值为0", groups = { ListValidation.class }, value = 0)
    private Integer rowStartNumber;

    @JsonProperty("row_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Min(message = "最小值为0", groups = { ListValidation.class }, value = 0)
    private Integer rowCount;


    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }





    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }





    /**
     * @return the rowStartNumber
     */
    public Integer getRowStartNumber() {
        return rowStartNumber;
    }





    /**
     * @param rowStartNumber the rowStartNumber to set
     */
    public void setRowStartNumber(Integer rowStartNumber) {
        this.rowStartNumber = rowStartNumber;
    }





    /**
     * @return the rowCount
     */
    public Integer getRowCount() {
        return rowCount;
    }





    /**
     * @param rowCount the rowCount to set
     */
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }





    public interface ListValidation {
    };
}
