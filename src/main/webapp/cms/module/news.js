var newsList={
    debug: true,
    data: {},
    pageNo: 1,
    pageSize: 10,
    newsListPage: function () {
        this.queryNews();
    },
    showDetail:function(){

    },
    queryNews:function(){
        $.ajax({
            type: "GET",
            dataType: "json",
            url: '/rest/news/' + this.pageNo+'/'+this.pageSize,
            success: function (data) {
                var tbodyHtml="";
                $.each(data.data, function(i, n) {
                    tbodyHtml+="<tr><td>"+ n.news_id+"</td>"
                            +"<td>"+ n.news_title+"</td>"
                            +"<td>"+ n.news_type+"</td>"
                            +"<td>"+ n.news_menu+"</td>"
                            +"<td><a class=\"btn\"><i class=\"fa fa-edit\"></i>编辑</a>"
                            +"<a class=\"btn\" href=\"javascript:newsList.delNews("+ n.news_id+")\">"
                            +"<i class=\"fa fa-trash-o\"></i> 删除</a> </td></tr>";
                });
                $(".table tbody").html(tbodyHtml);
            }
        });
    },
    delNews:function(news_id){
        $.ajax({
            type: "DELETE",
            dataType: "json",
            url: '/rest/news/system/' +news_id,
            success: function (data) {
                if(data.data==1){
                  this.queryNews();
                }
            }
        });
    },
    init:function(){
        this.newsListPage();
    },
}

newsList.init();