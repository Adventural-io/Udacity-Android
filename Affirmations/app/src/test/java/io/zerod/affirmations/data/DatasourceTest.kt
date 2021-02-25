package io.zerod.affirmations.data

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DatasourceTest {

    lateinit var datasource: Datasource

    @Before
    fun setUp() {
        datasource = Datasource()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun loadAffirmationsTest() {
        assertEquals(datasource.loadAffirmations().size, 10)
    }
}