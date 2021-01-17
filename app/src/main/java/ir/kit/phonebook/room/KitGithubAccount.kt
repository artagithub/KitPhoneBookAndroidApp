package ir.kit.phonebook.room

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


/**
 * A KitGithubAccount.
 */
@Entity
@Parcelize
data class KitGithubAccount (
        @PrimaryKey val id: String,
        val name: String?,
        val phoneNumber: String?,
        val email: String?,
        val organization: String?,
        val github: String?,
        val githubRepoNames: ArrayList<String>?
        ):Parcelable