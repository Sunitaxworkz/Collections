package com.xworkz.collections.dto;

public class CosmeticsDTO {
	private String name;
	private String brand;
	private Double price;
	private String OriginCountry;
	private int netWeight;
	private boolean lightWeight;
	private boolean ayurvedic;
	private boolean CertifiedByCOSMOS;

	public CosmeticsDTO() {
		System.out.println("default constructor for CosmeticsDTO");
	}

	public CosmeticsDTO(String name, String brand, Double price, String originCountry, int netWeight,
			boolean lightWeight, boolean ayurvedic, boolean certifiedByCOSMOS) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		OriginCountry = originCountry;
		this.netWeight = netWeight;
		this.lightWeight = lightWeight;
		this.ayurvedic = ayurvedic;
		CertifiedByCOSMOS = certifiedByCOSMOS;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", OriginCountry="
				+ OriginCountry + ", netWeight=" + netWeight + ", lightWeight=" + lightWeight + ", ayurvedic="
				+ ayurvedic + ", CertifiedByCOSMOS=" + CertifiedByCOSMOS + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method for cosmeticsDTO");
		if (obj == null)
			return false;
		if (obj instanceof CosmeticsDTO) {
			CosmeticsDTO ref = (CosmeticsDTO) obj;
			if (this.name.equalsIgnoreCase(ref.getName()) && this.price.equals(ref.getPrice())
					&& this.brand.equals(ref.getBrand())) {
				System.out.println("Cosmetic is equals:" + this.brand);
				return true;
			} else {
				System.out.println("Cosmetic is not equals:" + this.brand);
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getOriginCountry() {
		return OriginCountry;
	}

	public void setOriginCountry(String originCountry) {
		OriginCountry = originCountry;
	}

	public int getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}

	public boolean isLightWeight() {
		return lightWeight;
	}

	public void setLightWeight(boolean lightWeight) {
		this.lightWeight = lightWeight;
	}

	public boolean isAyurvedic() {
		return ayurvedic;
	}

	public void setAyurvedic(boolean ayurvedic) {
		this.ayurvedic = ayurvedic;
	}

	public boolean isCertifiedByCOSMOS() {
		return CertifiedByCOSMOS;
	}

	public void setCertifiedByCOSMOS(boolean certifiedByCOSMOS) {
		CertifiedByCOSMOS = certifiedByCOSMOS;
	}

}
