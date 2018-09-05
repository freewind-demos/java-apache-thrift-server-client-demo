namespace java thrift_gen
namespace py thrift_gen

typedef i32 int

service PlusService {
        int plus(1:int n1, 2:int n2)
}