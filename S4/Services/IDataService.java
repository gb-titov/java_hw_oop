package S4.Services;

import java.util.List;

import S4.Models.BaseTask;

public interface IDataService {
    void Save(List<BaseTask> tasks);
    List<BaseTask> Load();
}
