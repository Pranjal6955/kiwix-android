package org.kiwix.kiwixmobile.activities;

import android.Manifest;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kiwix.kiwixmobile.bookmark.BookmarksActivity;

@RunWith(AndroidJUnit4.class)
public class BookmarksActivityTest {

  @Rule
  public ActivityTestRule<BookmarksActivity> mActivityTestRule = new ActivityTestRule<>(
      BookmarksActivity.class);
  @Rule
  public GrantPermissionRule readPermissionRule =
      GrantPermissionRule.grant(Manifest.permission.READ_EXTERNAL_STORAGE);
  @Rule
  public GrantPermissionRule writePermissionRule =
      GrantPermissionRule.grant(Manifest.permission.WRITE_EXTERNAL_STORAGE);

  @Test
  public void testSimple() {

  }
}
