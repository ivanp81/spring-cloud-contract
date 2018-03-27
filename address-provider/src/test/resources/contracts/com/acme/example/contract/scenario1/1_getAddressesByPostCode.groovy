org.springframework.cloud.contract.spec.Contract.make {
  request {
    method 'GET'
    url '/addresses/XX2000X'
  }
response {
  status 200
  body([
    "latitude": "51.390205383300781",
    "longitude": "-0.13203597068786621",
    "addresses": [
      "10 Watkin Terrace, , , , , Northampton, Northamptonshire",
      "12 Watkin Terrace, , , , , Northampton, Northamptonshire"
    ]
  ])
  headers {
    contentType('application/json')
  }
 }
}