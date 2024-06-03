package ru.rsue.fomenkov.laba12.driodquest12;

import androidx.fragment.app.Fragment;

public class BookListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new BookListFragment();
    }
}
