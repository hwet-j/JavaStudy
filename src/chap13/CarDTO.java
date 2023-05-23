package chap13;

import java.text.SimpleDateFormat;
import java.util.Date;


// DTO : Data Transfer Object => getter, setter

// VO : Value Object => getter
public class CarDTO {
	// 필드
	// [접근제어자] [제어자] 타입 변수명 [= 초기값];
	private String brand;
	private String modelName;
	private int distance;
	private double fuelE;
	private Date productDate;
	private boolean isNavi;
			
	
	// 생성자
	// [접근제어자] [제어자] 클래스명 (매개변수 리스트){....}
	CarDTO(){
		//System.out.println("기본생성자");
	}
	
	public CarDTO(String brand, String modelName, int distance,	
			double fuelE, Date productDate,	boolean isNavi){
		this.brand = brand;
		this.modelName = modelName;
		this.distance = distance;
		this.productDate = productDate;
		this.fuelE = fuelE;
		this.isNavi = isNavi;
	}

	// 메서드
	// [접근제어자] [제어자] 리턴타입 메서드명(매개변수 리스트){....}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getFuelE() {
		return fuelE;
	}

	public void setFuelE(double fuelE) {
		this.fuelE = fuelE;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public boolean isNavi() {
		return isNavi;
	}

	public void setNavi(boolean isNavi) {
		this.isNavi = isNavi;
	}
	
	public void showInfo() {
		System.out.println("브랜드명 : " + this.getBrand());
		System.out.println("모델명 : " + this.getModelName());
		System.out.println("이동거리 : " + this.getDistance());
		System.out.println("연비 : " + this.getFuelE());
		System.out.println("생산일자 : " + this.getProductDate());
		System.out.println("네비유무 : " + this.isNavi());
		System.out.println();
	}

	@Override
	public String toString() {
		return "CarDTO [brand=" + brand + ", modelName=" + modelName + ", distance=" + distance + ", fuelE=" + fuelE
				+ ", productDate=" + productDate + ", isNavi=" + isNavi + "]";
	}
	
	
	
	
	
}
