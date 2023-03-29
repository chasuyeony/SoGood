package com.gigamole.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gigamole.SoGood.ntb.NavigationTabBar;

import java.util.ArrayList;

/**
 * Created by GIGAMOLE on 28.03.2016.
 */
public class Good_Introduce extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_introduce );
        initUI();
    }

    private void initUI() {

        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_today_good);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 7;
            }

            @Override
            public boolean isViewFromObject(final View view, final Object object) {
                return view.equals(object);
            }

            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView((View) object);
            }

            @Override
            public Object instantiateItem(final ViewGroup container, final int position) {
                if(position==0) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter() );

                    container.addView( view );
                    return view;
                }
                else if(position==1) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter2() );

                    container.addView( view );
                    return view;
                }
                else if(position==2) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter3() );

                    container.addView( view );
                    return view;
                }
                else if(position==3) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter4() );

                    container.addView( view );
                    return view;
                }
                else if(position==4) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter5() );

                    container.addView( view );
                    return view;
                }
                else if(position==5) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter6() );

                    container.addView( view );
                    return view;
                }else if(position==6) {
                    final View view = LayoutInflater.from(
                            getBaseContext() ).inflate( R.layout.item_vp_list, null, false );

                    final RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.rv );
                    recyclerView.setHasFixedSize( true );
                    recyclerView.setLayoutManager( new LinearLayoutManager(
                                    getBaseContext(), LinearLayoutManager.VERTICAL, false
                            )
                    );
                    recyclerView.setAdapter( new RecycleAdapter7() );

                    container.addView( view );
                    return view;
                }
                return null;
            }
        });

        final String[] colors = getResources().getStringArray(R.array.default_preview);

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_first),
                        Color.parseColor(colors[1]))
                        .title("스티커")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_second),
                        Color.parseColor(colors[1]))
                        .title("인화")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_third),
                        Color.parseColor(colors[1]))
                        .title("포토카드")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fourth),
                        Color.parseColor(colors[1]))
                        .title("배너")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fifth),
                        Color.parseColor(colors[1]))
                        .title("노트")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fifth),
                        Color.parseColor(colors[1]))
                        .title("거울")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fifth),
                        Color.parseColor(colors[1]))
                        .title("팬시")
                        .build()
        );
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 0);
        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {

            }

            @Override
            public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {

            }
        });

        findViewById(R.id.mask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                for (int i = 0; i < navigationTabBar.getModels().size(); i++) {
                    navigationTabBar.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                        }
                    }, i * 100);
                }
            }
        });
    }

    public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "사각스티커", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "도무송", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "전차스", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "리무버블스티커", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 4;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }

    public class RecycleAdapter2 extends RecyclerView.Adapter<RecycleAdapter2.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list2, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "사진인화", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "포스터", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "폴라로이드", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "증명사진", 0 ) );
            }
            else if(position == 4){
                holder.txt.setText( String.format( "지갑사진", 0 ) );
            }
            else if(position == 5) {
                holder.txt.setText( String.format( "캘린더", 0 ) );
            }
            else if(position == 6){
                holder.txt.setText( String.format( "가랜더", 0 ) );
            }
            else if(position == 7){
                holder.txt.setText( String.format( "포토북", 0 ) );
            }

        }

        @Override
        public int getItemCount( ) {

            return 8;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }

    public class RecycleAdapter3 extends RecyclerView.Adapter<RecycleAdapter3.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list3, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "포토카드", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "투명포토카드", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "홀로그램카드", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "사원증", 0 ) );
            }
            else if(position == 4){
                holder.txt.setText( String.format( "엽서", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 5;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }

    public class RecycleAdapter4 extends RecyclerView.Adapter<RecycleAdapter4.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list4, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "미니배너", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "투명미니배너", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "캔버스배너", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "폼보드등신대", 0 ) );
            }
            else if(position == 4){
                holder.txt.setText( String.format( "족자봉", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 5;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }

    public class RecycleAdapter5 extends RecyclerView.Adapter<RecycleAdapter5.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list5, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "원형거울", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "카드거울", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "거울버튼", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "거울조명액자", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 4;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }


    public class RecycleAdapter6 extends RecyclerView.Adapter<RecycleAdapter6.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list6, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "떡메모지", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "스프링노트", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "스케줄러", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "스터디플래너", 0 ) );
            }
            else if(position == 4){
                holder.txt.setText( String.format( "스케치북", 0 ) );
            }
            else if(position == 5){
                holder.txt.setText( String.format( "포스트잇", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 6;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }
    public class RecycleAdapter7 extends RecyclerView.Adapter<RecycleAdapter7.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list7, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            if(position == 0) {
                holder.txt.setText( String.format( "핀버튼", 0 ) );
            }else if(position == 1){
                holder.txt.setText( String.format( "담요", 0 ) );
            }
            else if(position == 2){
                holder.txt.setText( String.format( "쿠션", 0 ) );
            }
            else if(position == 3){
                holder.txt.setText( String.format( "파우치", 0 ) );
            }
            else if(position == 4){
                holder.txt.setText( String.format( "부채", 0 ) );
            }
            else if(position == 5){
                holder.txt.setText( String.format( "안경닦이", 0 ) );
            }
            else if(position == 6){
                holder.txt.setText( String.format( "퍼즐", 0 ) );
            }
            else if(position == 7){
                holder.txt.setText( String.format( "마우스패드", 0 ) );
            }
            else if(position == 8){
                holder.txt.setText( String.format( "폰케이스", 0 ) );
            }
            else if(position == 9){
                holder.txt.setText( String.format( "텀블러", 0 ) );
            }
            else if(position == 10){
                holder.txt.setText( String.format( "보틀", 0 ) );
            }
            else if(position == 11){
                holder.txt.setText( String.format( "머그컵", 0 ) );
            }
        }

        @Override
        public int getItemCount( ) {

            return 12;
        } //20개

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }
}
