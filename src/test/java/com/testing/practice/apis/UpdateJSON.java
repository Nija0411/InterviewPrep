package com.testing.practice.apis;

import org.json.JSONArray;
import org.json.JSONObject;

public class UpdateJSON {

    //Add JSON/GSON Library to pom.xml
    //Change the "productName": "Laptop", to "productName": "Desktop",

    public static void main(String[] args) {
        String jsonPayload = """
                            {
                              "orderId": "01001",
                              "orderDate": "2025-05-10",
                              "customer": {
                                "name": "Bob Johnson",
                                "address": {
                                  "street": "123 Maple Street",
                                  "city": "Anytown",
                                  "state": "CA",
                                  "zip": "90210"
                                }
                              },
                              "contact": {
                                "email": "bob.j@example.com",
                                "phone": "555-4567"
                              },
                              "items": [
                                {
                                  "productId": "P001",
                                  "productName": "Laptop",
                                  "quantity": 2,
                                  "price": 999.99
                                },
                                {
                                  "productId": "P003",
                                  "productName": "Keyboard",
                                  "quantity": 1,
                                  "price": 75.5
                                }
                              ],
                              "associatedProblems": [
                                {
                                  "problemName": "Diabetes",
                                  "medications": [
                                    {
                                      "medicationName": "Aspirin",
                                      "dose": "500 mg"
                                    },
                                    {
                                      "medicationName": "Metformin",
                                      "dose": "850 mg"
                                    }
                                  ]
                                }
                              ],
                              "status": "pending"
                            }
                """;

        JSONObject jsonObject = new JSONObject(jsonPayload);
//        System.out.println(jsonObject.toString(2));

        JSONArray items = jsonObject.getJSONArray("items");
//        System.out.println(items.getJSONObject(0).toString(2));
//
//        //Change the value to Desktop
//        items.getJSONObject(0).put("productName","Desktop");
//        System.out.println(items.getJSONObject(0).toString(2));

        //In interview always use loops
        for (int index = 0; index < items.length(); index++) {
            JSONObject item = items.getJSONObject(index);

            if (item.getString("productName").equalsIgnoreCase("Laptop")) {
                item.put("productName", "Desktop");
            }
        }
        System.out.println(jsonObject.toString(2));

    }
}
