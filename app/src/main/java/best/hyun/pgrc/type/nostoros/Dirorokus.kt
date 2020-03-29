package best.hyun.pgrc.type.nostoros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Dirorokus : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_dirorokus)
    override val type: PET_TYPE
        get() = PET_TYPE.NOSTOROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_dirorokus)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 53
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1469
    override val maxLvMaxAtk: Int
        get() = 351
    override val maxLvMaxDef: Int
        get() = 234
    override val maxLvMaxSpd: Int
        get() = 175
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1260
    override val maxLvMinAtk: Int
        get() = 313
    override val maxLvMinDef: Int
        get() = 196
    override val maxLvMinSpd: Int
        get() = 144
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
}