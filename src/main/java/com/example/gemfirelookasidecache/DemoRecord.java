package com.example.gemfirelookasidecache;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoRecord {
  @Id
  Integer demoId;
  String aaa;

  public DemoRecord() {
  }

  public DemoRecord(Integer demoId, String aaa) {
    this.demoId = demoId;
    this.aaa = aaa;
  }

  public Integer getDemoId() {
    return demoId;
  }

  public void setDemoId(Integer demoId) {
    this.demoId = demoId;
  }

  public String getAaa() {
    return aaa;
  }

  public void setAaa(String aaa) {
    this.aaa = aaa;
  }
}
