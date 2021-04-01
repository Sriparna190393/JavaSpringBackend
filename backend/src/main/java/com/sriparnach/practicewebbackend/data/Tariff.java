package com.sriparnach.practicewebbackend.data;

import org.springframework.data.annotation.Id;

public class Tariff {

    @Id
    private String id;

    private String category;

    private String modelName;

    private float charge;

    public Tariff(String category,String modelName,float charge){
        this.category = category;
        this.modelName = modelName;
        this.charge = charge;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getModelName() {
        return modelName;
    }
    public float getCharge(){
        return charge;
    }

}

/*
curl -X POST \
  http://localhost:8080/api/tariff/ \
  -H 'Content-Type: application/json' \
  -d '{
	"category":"Luxurious",
	"modelName":"BMW",
	"charge":2500.00
}'

curl -X DELETE http://localhost:8080/api/tariff/606655865ed6de0f4c6e432b
 */