// Create a booking and return the booking number (HTTP)
// Find the shipment and get the CMS number (HTTP)
// Create BL and get the BL id (HTTP)
// Get the BL number (DB)

const createNewBkg = {
    desc: 'Create new BKG and Get BKG Number',
    type: 'HTTP', 
    // input: ['RTE_POINT_ID'],
    spec: __dirname + '/createBkg.http',
    assertion: __dirname + '/all_assertion_rules.js'
}

const getCMS = {
    desc: 'Get CMS',
    type: 'HTTP', 
    input: ['bkgNum'],
    spec: __dirname + '/searchShp.http',
    assertion: __dirname + '/all_assertion_rules.js'
}

const createBL = {
    desc: 'Create new BKG and Get BKG Number',
    type: 'HTTP', 
    input: ['bkgNum','contNum'],
    spec: __dirname + '/createBL.http',
    assertion: __dirname + '/all_assertion_rules.js'
}


const checkDB = {    
        desc: 'Check DB for saved record', //M    
        type: 'DB', //M    
        input: ['blId'], //O    
        sql: `select BILL_OF_LADING_ID, BILL_OF_LADING_NUM from DOC_BILL_OF_LADING WHERE BILL_OF_LADING_ID = '{{blId}}'`,
        assertion: { //O    
            "output": [    
                {    
                    "fieldName": "0.BILL_OF_LADING_ID",    
                    "alias": "BL ID"    
                },
                {    
                    "fieldName": "0.BILL_OF_LADING_NUM",    
                    "alias": "BL NUM"    
                }    
            ]    
        },    
        connInfoList: { //M    
            qa1: {    
                connectString: 'hkir4qa1/ir4qa1.oocl',    
                user: 'gqa_supp',    
                password: 'b3yt867Gtfxm'    
            }    
        }    
    }

module.exports = {    
    name: 'Create BL from BKG',    
    auth: {platform: 'IR4', user: 'zhengta2:Tuesday'},    
    // input: __dirname + '/dpmc.flow.data.json', //only support reusable data here, please specify a seperate file for non-reusable data
    steps: [    
        createNewBkg,
        getCMS,
        createBL,
        checkDB
    ],    
    emails: ['gayle.bernadette.bituin@oocl.com','ryan.james.carreon@oocl.com','chris.chen@oocl.com','ume.yuan@oocl.com','angelica.buan@oocl.com','sheila.sy@oocl.com']
}
