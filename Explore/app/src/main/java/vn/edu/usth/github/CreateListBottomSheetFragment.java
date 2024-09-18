package vn.edu.usth.github;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CreateListBottomSheetFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_list_bottom_sheet, container, false);

        // Initialize views
        EditText listNameEditText = view.findViewById(R.id.listNameEditText);
        EditText descriptionEditText = view.findViewById(R.id.listDescriptionEditText);

        // Set up click listeners for the Cancel and Create buttons
        view.findViewById(R.id.cancelButton).setOnClickListener(v -> dismiss());

        view.findViewById(R.id.createListButton).setOnClickListener(v -> {
            // Retrieve input data
            String listName = listNameEditText.getText().toString().trim();
            String description = descriptionEditText.getText().toString().trim();

            // Validate inputs
            if (listName.isEmpty()) {
                Toast.makeText(getContext(), "List name cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }

            // Show the toast message when the list is created
            Toast toast = Toast.makeText(getContext(), "List created and saved", Toast.LENGTH_LONG);
            toast.setGravity(android.view.Gravity.CENTER, 0, 0); // Display in the center
            toast.show();

            //Backend

            // Dismiss the bottom sheet after creating the list
            dismiss();
        });

        return view;
    }
}
