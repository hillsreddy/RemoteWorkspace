package sort.array;

//If this.countryId < country.countryId:then compare method will return -1
//If this.countryId > country.countryId:then compare method will return 1
//If this.countryId==country.countryId:then compare method will return 0

public class ComparableCountry implements Comparable<ComparableCountry>{
  int countryId;
  String countryName;
  
  
  public ComparableCountry(int countryId, String countryName) {
      super();
      this.countryId = countryId;
      this.countryName = countryName;
  }
  
  @Override
  public int compareTo(ComparableCountry country) {
      return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
  }
  
  
  public int getCountryId() {
      return countryId;
  }
  
  
  public void setCountryId(int countryId) {
      this.countryId = countryId;
  }
  
  
  public String getCountryName() {
      return countryName;
  }
  
  
  public void setCountryName(String countryName) {
      this.countryName = countryName;
  }
  
}
