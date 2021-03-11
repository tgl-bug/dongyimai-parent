package com.offcn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author By--tgl
 * @time 2021/2/23$ 20:17$
 * @Version: 1.0
 * @Description Java类作用描述:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {
    /**
     * 总记录数
     */
    private long total;
    /**
     * 当前页结果
     */
    private List rows;


}
