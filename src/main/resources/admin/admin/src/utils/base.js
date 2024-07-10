const base = {
    get() {
        return {
            url : "http://localhost:8080/yiyuanziyuanguanli/",
            name: "yiyuanziyuanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiyuanziyuanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院资源管理系统"
        } 
    }
}
export default base
