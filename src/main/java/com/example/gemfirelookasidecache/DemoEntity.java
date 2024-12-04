package com.example.gemfirelookasidecache;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer demoId;
    String aaa;

    public DemoEntity(Integer demoId, String aaa) {
        this.demoId = demoId;
        this.aaa = aaa;
    }

    public DemoEntity() {

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
