
module.exports = {
    "globalAssertion": {
  
    },
  
    "assertion_criteria": [
      {
        url: '/wls_prs_bkg/secured/booking/create',
        whitelist: ['success'],
        output: [
          {'fieldName': 'data.id', 'alias': 'bookingNum'},
        ]
      },
      {
        url: '/wls_prs_shv/secured/findShipments/search',
        whitelist: ['success'],
        output: [
          {'fieldName': 'data.rows.0.containerNumber', 'alias': 'cms'},
        ]
      },
      {
        url: '/wls_prs_doc/secured/blc/blCreation/create',
        whitelist: ['success'],
        output: [
          {'fieldName': 'data.id', 'alias': 'bl'},
        ]
      }
    ]
  }
  