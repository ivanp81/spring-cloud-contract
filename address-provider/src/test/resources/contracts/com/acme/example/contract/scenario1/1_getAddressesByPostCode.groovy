org.springframework.cloud.contract.spec.Contract.make {
  request {
    method 'GET'
    url '/find/XX2000X'
  }
response {
  status 200
  body([
    "latitude": 51.39020538330078,
    "longitude": -0.1320359706878662,
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