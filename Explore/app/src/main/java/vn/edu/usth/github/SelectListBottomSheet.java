package vn.edu.usth.github;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SelectListBottomSheet extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select_list_bottom_sheet, container, false);

        // Handle "Done" button click event
        TextView doneButton = view.findViewById(R.id.doneButton);
        doneButton.setOnClickListener(v -> dismiss());

        // Handle "Create List" button click
        view.findViewById(R.id.createList).setOnClickListener(v -> {
            // Show the CreateListBottomSheetFragment
            CreateListBottomSheetFragment createListBottomSheet = new CreateListBottomSheetFragment();
            createListBottomSheet.show(getParentFragmentManager(), "CreateListBottomSheet");
            dismiss(); // Close the current bottom sheet
        });

        return view;
    }
}
