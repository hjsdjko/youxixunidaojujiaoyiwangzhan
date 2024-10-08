package com.entity.view;

import com.entity.DaojuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 道具
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("daoju")
public class DaojuView extends DaojuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 道具类型的值
		*/
		private String daojuValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public DaojuView() {

	}

	public DaojuView(DaojuEntity daojuEntity) {
		try {
			BeanUtils.copyProperties(this, daojuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 道具类型的值
			*/
			public String getDaojuValue() {
				return daojuValue;
			}
			/**
			* 设置： 道具类型的值
			*/
			public void setDaojuValue(String daojuValue) {
				this.daojuValue = daojuValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}











}
