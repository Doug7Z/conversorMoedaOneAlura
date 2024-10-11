package main;

import com.google.gson.annotations.SerializedName;

public class DadosAPI {
	
	 @SerializedName("result")
	    private String result;
	    
	    @SerializedName("documentation")
	    private String documentation;
	    
	    @SerializedName("terms_of_use")
	    private String terms_of_use;
	    
	    @SerializedName("time_last_update_unix")
	    private long time_last_update_unix;
	    
	    @SerializedName("time_last_update_utc")
	    private String time_last_update_utc;
	    
	    @SerializedName("time_next_update_unix")
	    private long time_next_update_unix;
	    
	    @SerializedName("time_next_update_utc")
	    private String time_next_update_utc;
	    
	    @SerializedName("base_code")
	    private String base_code;
	    
	    @SerializedName("target_code")
	    private String target_code;
	    
	    @SerializedName("conversion_rate")
	    private double conversion_rate;
	    
	    @SerializedName("conversion_result")
	    private double conversion_result;
    
    
    
    
    public DadosAPI() {
		// TODO Auto-generated constructor stub
	}
    
    
    public DadosAPI(String target_code ,double conversion_result ) {
		this.target_code = target_code;
		this.conversion_result = conversion_result;
	}
    
    public DadosAPI(MoedaRecord moedaRecord ) {
		this.conversion_result = Double.valueOf(moedaRecord.conversion_result());
		this.target_code = moedaRecord.target_code();
    	
	}

	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getDocumentation() {
		return documentation;
	}


	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}


	public String getTerms_of_use() {
		return terms_of_use;
	}


	public void setTerms_of_use(String terms_of_use) {
		this.terms_of_use = terms_of_use;
	}


	public long getTime_last_update_unix() {
		return time_last_update_unix;
	}


	public void setTime_last_update_unix(long time_last_update_unix) {
		this.time_last_update_unix = time_last_update_unix;
	}


	public String getTime_last_update_utc() {
		return time_last_update_utc;
	}


	public void setTime_last_update_utc(String time_last_update_utc) {
		this.time_last_update_utc = time_last_update_utc;
	}


	public long getTime_next_update_unix() {
		return time_next_update_unix;
	}


	public void setTime_next_update_unix(long time_next_update_unix) {
		this.time_next_update_unix = time_next_update_unix;
	}


	public String getTime_next_update_utc() {
		return time_next_update_utc;
	}


	public void setTime_next_update_utc(String time_next_update_utc) {
		this.time_next_update_utc = time_next_update_utc;
	}


	public String getBase_code() {
		return base_code;
	}


	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}


	public String getTarget_code() {
		return target_code;
	}


	public void setTarget_code(String target_code) {
		this.target_code = target_code;
	}


	public double getConversion_rate() {
		return conversion_rate;
	}


	public void setConversion_rate(double conversion_rate) {
		this.conversion_rate = conversion_rate;
	}


	public double getConversion_result() {
		return conversion_result;
	}


	public void setConversion_result(double conversion_result) {
		this.conversion_result = conversion_result;
	}
    
	
	 @Override
	    public String toString() {
	        return "ConversionResponse{" +
	                ", target_code='" + target_code + '\'' +
	                ", conversion_result=" + conversion_result +
	                '}';
	    }
    

}
