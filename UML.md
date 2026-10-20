+---------------------------------------------------+
|                  QueueSystem                      |
+---------------------------------------------------+
| - currentQueueNo: int                             |
| - lastIssuedQueueNo: int                          |
| - instance: QueueSystem                           |
+---------------------------------------------------+
| - QueueSystem()                                   |
| + getInstance(): QueueSystem                      |
| + getCurrentQueueNo(): int                        |
| + getNextQueueNo(): int                           |
| + resetQueue(newNo: int): void                    |
+---------------------------------------------------+
                         ^
                         | uses singleton instance
+---------------------------------------------------+
|                     UserApp                       |
+---------------------------------------------------+
| + main(args: String[]): void                      |
+---------------------------------------------------+