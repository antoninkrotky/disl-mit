package org.disl.util.sqlDep

import org.junit.Test

import static org.junit.Assert.assertEquals

class TestCreateSqlSetRequest {

    @Test
    void testToJson() {
        CreateSqlSetRequest request = new CreateSqlSetRequest(userAccountId: 'xxx', customSqlSetName: 'test', queries: [new SqlDepQuery(sourceCode: 'select 1 as a from dual', groupName: 'testing group', name: 'testing query')])
        String expected = '''\
{
    "dialect": "generic",
    "queries": [
        {
            "groupName": "testing group",
            "sourceCode": "select 1 as a from dual",
            "name": "testing query"
        }
    ],
    "customSqlSetName": "test",
    "userAccountId": "xxx"
}'''
        assertEquals(expected, request.toJson())
    }

}
