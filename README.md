# SpingBoot_Project

This Project Describes the building API for CRUD Operations using RESTAPI

http://localhost:8080/getcountries


 {
        "id": 1,
        "countryname": "India",
        "contrycapital": "Delhi"
    },
    {
        "id": 2,
        "countryname": "USA",
        "contrycapital": "Washington"
    },
    {
        "id": 3,
        "countryname": "UK",
        "contrycapital": "London"
    }
]

http://localhost:8080/getcountries/1

http://localhost:8080/getcountries/countryname?name=India

http://localhost:8080/addcountry

    {
        
        "countryname": "Paksitan",
        "contrycapital": "Kabul"
    }

http://localhost:8080/updateCountry
{
        "id": 3,
        "countryname": "Italy",
        "contrycapital": "Rome"
    }

http://localhost:8080/deletecountry/4
