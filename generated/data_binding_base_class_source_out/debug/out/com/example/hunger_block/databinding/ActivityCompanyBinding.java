// Generated by view binder compiler. Do not edit!
package com.example.hunger_block.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.hunger_block.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCompanyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button PickUp;

  @NonNull
  public final Button SignOut;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final Button custmize;

  private ActivityCompanyBinding(@NonNull ConstraintLayout rootView, @NonNull Button PickUp,
      @NonNull Button SignOut, @NonNull CalendarView calendarView, @NonNull Button custmize) {
    this.rootView = rootView;
    this.PickUp = PickUp;
    this.SignOut = SignOut;
    this.calendarView = calendarView;
    this.custmize = custmize;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCompanyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_company, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCompanyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PickUp;
      Button PickUp = rootView.findViewById(id);
      if (PickUp == null) {
        break missingId;
      }

      id = R.id.SignOut;
      Button SignOut = rootView.findViewById(id);
      if (SignOut == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = rootView.findViewById(id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.custmize;
      Button custmize = rootView.findViewById(id);
      if (custmize == null) {
        break missingId;
      }

      return new ActivityCompanyBinding((ConstraintLayout) rootView, PickUp, SignOut, calendarView,
          custmize);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
