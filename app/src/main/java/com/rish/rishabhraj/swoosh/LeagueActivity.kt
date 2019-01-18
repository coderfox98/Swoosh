package com.rish.rishabhraj.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    fun leagueNextClicked(view: View) {
        val skillActivity = Intent(this,SkillActivity::class.java)
        startActivity(skillActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }
}
