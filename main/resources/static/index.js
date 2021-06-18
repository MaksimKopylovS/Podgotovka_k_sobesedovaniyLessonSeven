angular.module('app', []).controller('indexController', function ($scope, $http){
    const contextPath = 'http://localhost:8189/app';

    $scope.findById = function (){
        $http.get(contextPath + '/student/' + $scope.id)
            .then(function (response){
                $scope.StudentList = response.data
                console.log($scope.StudentList)
            });
    }

    $scope.findAll = function(){
        $http.get(contextPath + '/student/all')
            .then(function (response){
               $scope.StudentList = response.data
               console.log($scope.StudentList)
            });
    }

    $scope.addStudent = function (){
        $http.post(contextPath + '/student/addStudent', $scope.student)
            .then(function (response){
            });
    }

    $scope.deleteStudentById = function(id){
        console.log(id)
        $http.delete(contextPath + '/student/del/'+ id)
            .then(function (response){
            });
    }

    $scope.editStudent = function (){
        console.log($scope.student)
        $http.put(contextPath +'/student/edit', $scope.student)
            .then(function (response){})
    }


});