const createBkg = {
    desc: 'Create and return Booking Number',
    auth: {
        qa1:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa2:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa3:{platform: 'IR4', user: 'yuanum:Tuesday2'}
    },
    type: 'HTTP',
    spec: __dirname + '/createBooking.http',
    assertion: __dirname + '/createBooking1.js'
}

const getCms = {
    desc: 'Get CMS Number',
    auth: {
        qa1:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa2:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa3:{platform: 'IR4', user: 'yuanum:Tuesday2'}
    },
    type: 'HTTP',
    input: ['bookingNum'],
    spec: __dirname + '/getCMS.http',
    assertion: __dirname + '/createBooking1.js'
}

const createBl = {
    desc: 'Create BL Number',
    auth: {
        qa1:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa2:{platform: 'IR4', user: 'yuanum:Tuesday2'},
        qa3:{platform: 'IR4', user: 'yuanum:Tuesday2'}
    },
    type: 'HTTP',
    input: ['bookingNum', 'cms'],
    spec: __dirname + '/createBl.http',
    assertion: __dirname + '/createBooking1.js'
}

const getBl = {
    desc: 'Get BL Number',
    type: 'DB',
    input: ['bl'],
    sql: `SELECT bill_of_lading_num FROM doc_bill_of_lading bl WHERE bl.bill_of_lading_id = {{bl}}`,
    assertion: { //O
        "output": [
            {
                "fieldName": "0.bill_of_lading_num",
                "alias": "BLNum"
            }
        ]
    },
    connInfoList: {
        qa3: {
            connectString: 'hkir4qa3/ir4qa3.oocl',
            user: 'gqa_supp',
            password: 'b3yt867Gtfxm'
        }
    }
}

module.exports = {
    name: 'Create Booking',
    steps: [
    createBkg,
    getCms,
    createBl,
    getBl
    ],
    output: ['bkg'],
    emails: ['princess.hannah.bangibang@oocl.com', 'ryan.james.carreon@oocl.com','chris.chen@oocl.com','ume.yuan@oocl.com','angelica.buan@oocl.com','sheila.sy@oocl.com']
}
